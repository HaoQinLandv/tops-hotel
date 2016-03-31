package com.dianping.cat.status.model.entity;

import com.dianping.cat.status.model.BaseEntity;
import com.dianping.cat.status.model.IVisitor;

public class ThreadsInfo extends BaseEntity<ThreadsInfo> {
   private int m_count;

   private int m_daemonCount;

   private int m_peekCount;

   private int m_totalStartedCount;

   private int m_catThreadCount;

   private int m_pigeonThreadCount;

   private int m_httpThreadCount;

   private String m_dump;

   public ThreadsInfo() {
   }

   @Override
   public void accept(IVisitor visitor) {
      visitor.visitThread(this);
   }

   @Override
   public boolean equals(Object obj) {
      if (obj instanceof ThreadsInfo) {
         ThreadsInfo _o = (ThreadsInfo) obj;
         int count = _o.getCount();
         int daemonCount = _o.getDaemonCount();
         int peekCount = _o.getPeekCount();
         int totalStartedCount = _o.getTotalStartedCount();
         int catThreadCount = _o.getCatThreadCount();
         int pigeonThreadCount = _o.getPigeonThreadCount();
         int httpThreadCount = _o.getHttpThreadCount();
         String dump = _o.getDump();
         boolean result = true;

         result &= (m_count == count);
         result &= (m_daemonCount == daemonCount);
         result &= (m_peekCount == peekCount);
         result &= (m_totalStartedCount == totalStartedCount);
         result &= (m_catThreadCount == catThreadCount);
         result &= (m_pigeonThreadCount == pigeonThreadCount);
         result &= (m_httpThreadCount == httpThreadCount);
         result &= (m_dump == dump || m_dump != null && m_dump.equals(dump));

         return result;
      }

      return false;
   }

   public int getCatThreadCount() {
      return m_catThreadCount;
   }

   public int getCount() {
      return m_count;
   }

   public int getDaemonCount() {
      return m_daemonCount;
   }

   public String getDump() {
      return m_dump;
   }

   public int getHttpThreadCount() {
      return m_httpThreadCount;
   }

   public int getPeekCount() {
      return m_peekCount;
   }

   public int getPigeonThreadCount() {
      return m_pigeonThreadCount;
   }

   public int getTotalStartedCount() {
      return m_totalStartedCount;
   }

   @Override
   public int hashCode() {
      int hash = 0;

      hash = hash * 31 + m_count;
      hash = hash * 31 + m_daemonCount;
      hash = hash * 31 + m_peekCount;
      hash = hash * 31 + m_totalStartedCount;
      hash = hash * 31 + m_catThreadCount;
      hash = hash * 31 + m_pigeonThreadCount;
      hash = hash * 31 + m_httpThreadCount;
      hash = hash * 31 + (m_dump == null ? 0 : m_dump.hashCode());

      return hash;
   }

   @Override
   public void mergeAttributes(ThreadsInfo other) {
      m_count = other.getCount();

      m_daemonCount = other.getDaemonCount();

      m_peekCount = other.getPeekCount();

      m_totalStartedCount = other.getTotalStartedCount();

      m_catThreadCount = other.getCatThreadCount();

      m_pigeonThreadCount = other.getPigeonThreadCount();

      m_httpThreadCount = other.getHttpThreadCount();
   }

   public ThreadsInfo setCatThreadCount(int catThreadCount) {
      m_catThreadCount = catThreadCount;
      return this;
   }

   public ThreadsInfo setCount(int count) {
      m_count = count;
      return this;
   }

   public ThreadsInfo setDaemonCount(int daemonCount) {
      m_daemonCount = daemonCount;
      return this;
   }

   public ThreadsInfo setDump(String dump) {
      m_dump = dump;
      return this;
   }

   public ThreadsInfo setHttpThreadCount(int httpThreadCount) {
      m_httpThreadCount = httpThreadCount;
      return this;
   }

   public ThreadsInfo setPeekCount(int peekCount) {
      m_peekCount = peekCount;
      return this;
   }

   public ThreadsInfo setPigeonThreadCount(int pigeonThreadCount) {
      m_pigeonThreadCount = pigeonThreadCount;
      return this;
   }

   public ThreadsInfo setTotalStartedCount(int totalStartedCount) {
      m_totalStartedCount = totalStartedCount;
      return this;
   }

}
