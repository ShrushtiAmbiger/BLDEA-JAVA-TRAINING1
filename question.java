package com.bldea.crorepatiapp.paackage;

import java.util.Scanner;

public class question {
	static String result;
	static String result2;
	static int count_life_line = 3;
	static int aud_phn = 1;
	static int cnt_50_50 = 1;
	static int skip_cnt = 1;
	static Scanner sc = new Scanner(System.in);

	public static boolean fetchQuestion1(String name) throws Exception {
		System.out.println("1. Who is the founder of Java?");
		System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n"
				+ "e) life line");
		result = sc.next();
		if (result.equalsIgnoreCase("d")) {
			candidate.setAmount(1000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out
								.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							candidate.setAmount(1000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										candidate.setAmount(1000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n"
												+ "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											candidate.setAmount(1000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(1000);
								return true;
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n"
												+ "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											candidate.setAmount(1000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							candidate.setAmount(1000);
						} else {
							return false;
						}

					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										candidate.setAmount(1000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n"
												+ "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											candidate.setAmount(1000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(1000);
								return true;
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n"
												+ "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n"
												+ "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											candidate.setAmount(1000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						candidate.setAmount(1000);
						return true;
					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n" + "b. 50-50  \n"
								+ "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n"
												+ "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											candidate.setAmount(1000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n"
												+ "option d = 87%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n"
												+ "c) Rahul Gandhi\n" + "d) James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											candidate.setAmount(1000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}
			} else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					candidate.setAmount(1000);
					return true;
				}
			}

		}
		return false;
	}

	public static boolean fetchQuestion2(String name) throws Exception {
		System.out.println("2. Who is the captain of RCB?");
		System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal\n" + "e) help line");
		result = sc.next();
		if (result.equalsIgnoreCase("c")) {
			candidate.setAmount(2000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out
								.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}
					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										candidate.setAmount(2000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("2")) {
											candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(2000);
								return true;
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							candidate.setAmount(2000);
							return true;
						} else {
							return false;
						}

					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										candidate.setAmount(2000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(2000);
								return true;
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n"
												+ "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						candidate.setAmount(2000);
						return true;
					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n" + "b. 50-50  \n"
								+ "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n"
												+ "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											candidate.setAmount(2000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println(
												"a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											candidate.setAmount(2000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}
			} else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					candidate.setAmount(2000);
					return true;
				}
			}

		}
		return false;
	}

	public static boolean fetchQuestion3(String name) throws Exception {
		System.out.println(
				"3.Brass gets discoloured in air because of the presence of which of " + "the following gases in air?");
		System.out.println(
				"a) Oxygen\n" + "b)Hydrogen sulphide\n" + "c)Carbon dioxide\n" + "d) nitrogen\n" + "e) life line");
		result = sc.next();
		if (result.equalsIgnoreCase("b")) {
			candidate.setAmount(3000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out
								.println("option a = 5%\n" + "option b = 80%\n" + "option c = 10%\n" + "option d = 5%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							candidate.setAmount(3000);
							return true;
						} else {
							return false;
						}
					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b)Hydrogen sulphide \n" + "d) nitrogen\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(3000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										candidate.setAmount(3000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Oxygen\n" + "b) Hydrogen sulphide\n"
												+ "c)Carbon dioxide\n" + "d) nitrogen\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(3000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(3000);
								return true;
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b)Hydrogen sulphide \n" + "d) nitrogen\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(3000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Oxygen\n" + "b) Hydrogen sulphide\n"
												+ "c)Carbon dioxide\n" + "d) nitrogen\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(3000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("b)Hydrogen sulphide \n" + "d) nitrogen\n");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							candidate.setAmount(3000);
						} else {
							return false;
						}

					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 5%\n" + "option b = 80%\n" + "option c = 10%\n" + "option d = 5%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(3000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										candidate.setAmount(3000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Oxygen\n" + "b) Hydrogen sulphide\n"
												+ "c)Carbon dioxide\n" + "d) nitrogen\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(3000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(3000);
								return true;
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 5%\n" + "option b = 80%\n" + "option c = 10%\n"
												+ "option d = 5%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(3000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Oxygen\n" + "b) Hydrogen sulphide\n"
												+ "c)Carbon dioxide\n" + "d) nitrogen\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(3000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						candidate.setAmount(3000);
						return true;
					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n" + "b. 50-50  \n"
								+ "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 5%\n" + "option b = 80%\n" + "option c = 10%\n" + "option d = 5%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(3000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b)Hydrogen sulphide \n" + "d) nitrogen\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(3000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Oxygen\n" + "b) Hydrogen sulphide\n"
												+ "c)Carbon dioxide\n" + "d) nitrogen\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(3000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b)Hydrogen sulphide \n" + "d) nitrogen\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(3000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 5%\n" + "option b = 80%\n" + "option c = 10%\n"
												+ "option d = 5%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(3000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Oxygen\n" + "b) Hydrogen sulphide\n"
												+ "c)Carbon dioxide\n" + "d) nitrogen\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(3000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}
			} else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a) Oxygen\n" + "b) Hydrogen sulphide\n" + "c)Carbon dioxide\n" + "d) nitrogen\n");
				result = sc.next();
				if (result.equalsIgnoreCase("b")) {
					candidate.setAmount(3000);
					return true;
				}
			}

		}

		return false;
	}

	public static boolean fetchQuestion4(String name) throws Exception {
		System.out.println("4).Entomology is the science that studies?");
		System.out.println("a)Behavior of human beings\n" + "b)Insects\n"
				+ "c)The origin and history of technical and scientific terms\n" + "d)The formation of rocks\n"
				+ "e) life line");
		result = sc.next();
		if (result.equalsIgnoreCase("b")) {
			candidate.setAmount(4000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out
								.println("option a = 2%\n" + "option b = 50%\n" + "option c = 8%\n" + "option d = 40%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							candidate.setAmount(4000);
							return true;
						} else {
							return false;
						}
					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println(
										"b)Insects\n" + "c)The origin and history of technical and scientific terms\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(4000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										candidate.setAmount(4000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Behavior of human beings\n" + "b)Insects\n"
												+ "c)The origin and history of technical and scientific terms\n"
												+ "d)The formation of rocks\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(4000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(4000);
								return true;
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b)Insects\n"
												+ "c)The origin and history of technical and scientific terms\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(4000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Behavior of human beings\n" + "b)Insects\n"
												+ "c)The origin and history of technical and scientific terms\n"
												+ "d)The formation of rocks\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(4000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println(
								"b)Insects\n" + "c)The origin and history of technical and scientific terms\n");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							candidate.setAmount(4000);
						} else {
							return false;
						}

					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 2%\n" + "option b = 50%\n" + "option c = 8%\n" + "option d = 40%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(4000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										candidate.setAmount(4000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Behavior of human beings\n" + "b)Insects\n"
												+ "c)The origin and history of technical and scientific terms\n"
												+ "d)The formation of rocks\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(4000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(4000);
								return true;
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 2%\n" + "option b = 50%\n" + "option c = 8%\n"
												+ "option d = 40%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(4000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Behavior of human beings\n" + "b)Insects\n"
												+ "c)The origin and history of technical and scientific terms\n"
												+ "d)The formation of rocks\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(4000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						candidate.setAmount(4000);
						return true;
					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n" + "b. 50-50  \n"
								+ "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 2%\n" + "option b = 50%\n" + "option c = 8%\n" + "option d = 40%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(4000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b)Insects\n"
												+ "c)The origin and history of technical and scientific terms\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(4000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Behavior of human beings\n" + "b)Insects\n"
												+ "c)The origin and history of technical and scientific terms\n"
												+ "d)The formation of rocks\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(4000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println(
										"b)Insects\n" + "c)The origin and history of technical and scientific terms\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(4000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 2%\n" + "option b = 50%\n" + "option c = 8%\n"
												+ "option d = 40%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(4000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Behavior of human beings\n" + "b)Insects\n"
												+ "c)The origin and history of technical and scientific terms\n"
												+ "d)The formation of rocks\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(4000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}
			} else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a)Behavior of human beings\n" + "b)Insects\n"
						+ "c)The origin and history of technical and scientific terms\n"
						+ "d)The formation of rocks\n");
				result = sc.next();
				if (result.equalsIgnoreCase("b")) {
					candidate.setAmount(4000);
					return true;
				}
			}

		}
		return false;
	}

	public static boolean fetchQuestion5(String name) throws Exception {
		System.out.println("4.Garampani sanctuary is located at?");
		System.out.println("a)Junagarh, Gujarat/n" + "b)Diphu, Assam/n" + "c)Kohima, Nagaland/n" + "d)Gangtok, Sikkim/n"
				+ "e) life line");
		result = sc.next();
		if (result.equalsIgnoreCase("b")) {
			candidate.setAmount(10000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println(
								"option a = 20%\n" + "option b = 50%\n" + "option c = 25%\n" + "option d = 5%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							candidate.setAmount(10000);
							return true;
						} else {
							return false;
						}
					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b)Diphu, Assam/n" + "c)Kohima, Nagaland/n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										candidate.setAmount(10000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Junagarh, Gujarat/n" + "b)Diphu, Assam/n"
												+ "c)Kohima, Nagaland/n" + "d)Gangtok, Sikkim/n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(10000);
								return true;
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b)Diphu, Assam/n" + "c)Kohima, Nagaland/n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Junagarh, Gujarat/n" + "b)Diphu, Assam/n"
												+ "c)Kohima, Nagaland/n" + "d)Gangtok, Sikkim/n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("b)Diphu, Assam/n" + "c)Kohima, Nagaland/n");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							candidate.setAmount(10000);
						} else {
							return false;
						}

					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 20%\n" + "option b = 50%\n" + "option c = 25%\n" + "option d = 5%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										candidate.setAmount(10000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Junagarh, Gujarat/n" + "b)Diphu, Assam/n"
												+ "c)Kohima, Nagaland/n" + "d)Gangtok, Sikkim/n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(1000);
								return true;
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 20%\n" + "option b = 50%\n" + "option c = 25%\n"
												+ "option d = 5%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Junagarh, Gujarat/n" + "b)Diphu, Assam/n"
												+ "c)Kohima, Nagaland/n" + "d)Gangtok, Sikkim/n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						candidate.setAmount(10000);
						return true;
					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n" + "b. 50-50  \n"
								+ "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 20%\n" + "option b = 50%\n" + "option c = 25%\n" + "option d = 5%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b)Diphu, Assam/n" + "c)Kohima, Nagaland/n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Junagarh, Gujarat/n" + "b)Diphu, Assam/n"
												+ "c)Kohima, Nagaland/n" + "d)Gangtok, Sikkim/n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b)Diphu, Assam/n" + "c)Kohima, Nagaland/n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 20%\n" + "option b = 50%\n" + "option c = 25%\n"
												+ "option d = 5%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)Junagarh, Gujarat/n" + "b)Diphu, Assam/n"
												+ "c)Kohima, Nagaland/n" + "d)Gangtok, Sikkim/n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}
			} else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println(
						"a)Junagarh, Gujarat/n" + "b)Diphu, Assam/n" + "c)Kohima, Nagaland/n" + "d)Gangtok, Sikkim/n");
				result = sc.next();
				if (result.equalsIgnoreCase("b")) {
					candidate.setAmount(10000);
					return true;
				}
			}

		}
		return false;
	}

	public static boolean fetchQuestion6(String name) throws Exception {
		System.out.println("6.FFC stands for ?");
		System.out.println("a.Foreign Finance Corporation\n" + "b.Film Finance Corporation\n"
				+ "c.Federation of Football Council\n" + "d.None of the above\n" + "e) life line");
		result = sc.next();
		if (result.equalsIgnoreCase("b")) {
			candidate.setAmount(20000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println(
								"option a = 30%\n" + "option b = 57%\n" + "option c = 3%\n" + "option d = 20%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							candidate.setAmount(20000);
							return true;
						} else {
							return false;
						}
					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a.Foreign Finance Corporation\n" + "b.Film Finance Corporation\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										candidate.setAmount(20000);
										return true;
									} else {
										System.out.println("a.Foreign Finance Corporation\n"
												+ "b.Film Finance Corporation\n" + "c.Federation of Football Council\n"
												+ "d.None of the above\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(20000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(20000);
								return true;
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println(
												"a.Foreign Finance Corporation\n" + "b.Film Finance Corporation\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Foreign Finance Corporation\n"
												+ "b.Film Finance Corporation\n" + "c.Federation of Football Council\n"
												+ "d.None of the above\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(20000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a.Foreign Finance Corporation\n" + "b.Film Finance Corporation\n");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							candidate.setAmount(20000);
						} else {
							return false;
						}

					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 30%\n" + "option b = 57%\n" + "option c = 3%\n" + "option d = 20%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										candidate.setAmount(20000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Foreign Finance Corporation\n"
												+ "b.Film Finance Corporation\n" + "c.Federation of Football Council\n"
												+ "d.None of the above\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(20000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(20000);
								return true;
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 30%\n" + "option b = 57%\n" + "option c = 3%\n"
												+ "option d = 20%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Foreign Finance Corporation\n"
												+ "b.Film Finance Corporation\n" + "c.Federation of Football Council\n"
												+ "d.None of the above\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(20000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						candidate.setAmount(20000);
						return true;
					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n" + "b. 50-50  \n"
								+ "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 30%\n" + "option b = 57%\n" + "option c = 3%\n" + "option d = 20%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println(
												"a.Foreign Finance Corporation\n" + "b.Film Finance Corporation\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Foreign Finance Corporation\n"
												+ "b.Film Finance Corporation\n" + "c.Federation of Football Council\n"
												+ "d.None of the above\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(20000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a.Foreign Finance Corporation\n" + "b.Film Finance Corporation\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 30%\n" + "option b = 57%\n" + "option c = 3%\n"
												+ "option d = 20%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Foreign Finance Corporation\n"
												+ "b.Film Finance Corporation\n" + "c.Federation of Football Council\n"
												+ "d.None of the above\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(20000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}
			} else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a.Foreign Finance Corporation\n" + "b.Film Finance Corporation\n"
						+ "c.Federation of Football Council\n" + "d.None of the above\n");
				result = sc.next();
				if (result.equalsIgnoreCase("b n")) {
					candidate.setAmount(20000);
					return true;
				}
			}

		}
		return false;
	}

	public static boolean fetchQuestion7(String name) throws Exception {
		System.out.println("The metal whose salts are sensitive to light is?");
		System.out.println("(a) Zinc\n" + "(b) Silver\n" + "(c) Copper\n" + "(d) Aluminum\n" + "e) life line");
		result = sc.next();
		if (result.equalsIgnoreCase("b")) {
			candidate.setAmount(30000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println(
								"option a = 30%\n" + "option b = 57%\n" + "option c = 3%\n" + "option d = 20%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							candidate.setAmount(30000);
							return true;
						} else {
							return false;
						}
					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a.Foreign Finance Corporation\n" + "b.Film Finance Corporation\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(30000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										candidate.setAmount(30000);
										return true;
									} else {
										System.out.println("a.Foreign Finance Corporation\n"
												+ "b.Film Finance Corporation\n" + "c.Federation of Football Council\n"
												+ "d.None of the above\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(30000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(30000);
								return true;
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println(
												"a.Foreign Finance Corporation\n" + "b.Film Finance Corporation\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(30000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Foreign Finance Corporation\n"
												+ "b.Film Finance Corporation\n" + "c.Federation of Football Council\n"
												+ "d.None of the above\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(30000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a.Foreign Finance Corporation\n" + "b.Film Finance Corporation\n");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							candidate.setAmount(30000);
						} else {
							return false;
						}

					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 30%\n" + "option b = 57%\n" + "option c = 3%\n" + "option d = 20%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(30000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										candidate.setAmount(30000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Foreign Finance Corporation\n"
												+ "b.Film Finance Corporation\n" + "c.Federation of Football Council\n"
												+ "d.None of the above\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(30000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(30000);
								return true;
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 30%\n" + "option b = 57%\n" + "option c = 3%\n"
												+ "option d = 20%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(30000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Foreign Finance Corporation\n"
												+ "b.Film Finance Corporation\n" + "c.Federation of Football Council\n"
												+ "d.None of the above\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(30000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						candidate.setAmount(30000);
						return true;
					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n" + "b. 50-50  \n"
								+ "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 30%\n" + "option b = 57%\n" + "option c = 3%\n" + "option d = 20%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(30000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println(
												"a.Foreign Finance Corporation\n" + "b.Film Finance Corporation\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(30000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Foreign Finance Corporation\n"
												+ "b.Film Finance Corporation\n" + "c.Federation of Football Council\n"
												+ "d.None of the above\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(30000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a.Foreign Finance Corporation\n" + "b.Film Finance Corporation\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(30000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 30%\n" + "option b = 57%\n" + "option c = 3%\n"
												+ "option d = 20%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(30000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Foreign Finance Corporation\n"
												+ "b.Film Finance Corporation\n" + "c.Federation of Football Council\n"
												+ "d.None of the above\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(30000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}
			} else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a.Foreign Finance Corporation\n" + "b.Film Finance Corporation\n"
						+ "c.Federation of Football Council\n" + "d.None of the above\n");
				result = sc.next();
				if (result.equalsIgnoreCase("b n")) {
					candidate.setAmount(30000);
					return true;
				}
			}

		}
		return false;
	}

	public static boolean fetchQuestion8(String name) throws Exception {
		System.out.println("1.Guwahati High Court is the judicature of ?");
		System.out.println(
				"a.Nagaland\n" + "b.Arunachal Pradesh\n" + "c.Assam\n" + "d.All of the above\n" + "e) life line");
		result = sc.next();
		if (result.equalsIgnoreCase("d")) {
			candidate.setAmount(50000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println(
								"option a = 25%\n" + "option b = 25%\n" + "option c = 10%\n" + "option d = 40%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							candidate.setAmount(50000);
							return true;
						} else {
							return false;
						}
					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b.Arunachal Pradesh\n" + "d) all of the above\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									candidate.setAmount(50000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										candidate.setAmount(50000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Nagaland\n" + "b.Arunachal Pradesh\n" + "c.Assam\n"
												+ "d.All of the above\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											candidate.setAmount(50000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(1000);
								return true;
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b.Arunachal Pradesh\n" + "d) all of the above\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Nagaland\n" + "b.Arunachal Pradesh\n" + "c.Assam\n"
												+ "d.All of the above\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											candidate.setAmount(50000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("b.Arunachal Pradesh\n" + "d) all of the above\n");
						result = sc.next();
						if (result.equalsIgnoreCase("d")) {
							candidate.setAmount(50000);
						} else {
							return false;
						}

					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 25%\n" + "option b = 25%\n" + "option c = 10%\n"
										+ "option d = 40%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										candidate.setAmount(50000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Nagaland\n" + "b.Arunachal Pradesh\n" + "c.Assam\n"
												+ "d.All of the above\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											candidate.setAmount(50000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(50000);
								return true;
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 25%\n" + "option b = 25%\n" + "option c = 10%\n"
												+ "option d = 40%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											candidate.setAmount(50000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Nagaland\n" + "b.Arunachal Pradesh\n" + "c.Assam\n"
												+ "d.All of the above\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											candidate.setAmount(50000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						candidate.setAmount(50000);
						return true;
					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n" + "b. 50-50  \n"
								+ "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 25%\n" + "option b = 25%\n" + "option c = 10%\n"
										+ "option d = 40%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									candidate.setAmount(50000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b.Arunachal Pradesh\n" + "d) all of the above\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											candidate.setAmount(50000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Nagaland\n" + "b.Arunachal Pradesh\n" + "c.Assam\n"
												+ "d.All of the above\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											candidate.setAmount(50000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b.Arunachal Pradesh\n" + "d) all of the above\n");
								result = sc.next();
								if (result.equalsIgnoreCase("d")) {
									candidate.setAmount(50000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 25%\n" + "option b = 25%\n" + "option c = 10%\n"
												+ "option d = 40%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											candidate.setAmount(50000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Nagaland\n" + "b.Arunachal Pradesh\n" + "c.Assam\n"
												+ "d.All of the above\n");
										result = sc.next();
										if (result.equalsIgnoreCase("d")) {
											candidate.setAmount(50000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}
			} else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a.Nagaland\n" + "b.Arunachal Pradesh\n" + "c.Assam\n" + "d.All of the above\n");
				result = sc.next();
				if (result.equalsIgnoreCase("d")) {
					candidate.setAmount(50000);
					return true;
				}
			}

		}
		return false;
	}

	public static boolean fetchQuestion9(String name) throws Exception {
		System.out.println("9.Film and TV institute of India is located ?");
		System.out.println("a.Pune (Maharashtra)\n" + "b.Rajkot (Gujarat)\n" + "c.Pimpri (Maharashtra)\n"
				+ "d.Perambur (Tamilnadu)\n" + "e) life line");
		result = sc.next();
		if (result.equalsIgnoreCase("a")) {
			candidate.setAmount(80000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out
								.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							candidate.setAmount(80000);
							return true;
						} else {
							return false;
						}
					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a.Pune (Maharashtra)\n" + "c.Pimpri (Maharashtra)\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(80000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("a")) {
									if (skip_cnt != 0) {
										candidate.setAmount(80000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Pune (Maharashtra)\n" + "b.Rajkot (Gujarat)\n"
												+ "c.Pimpri (Maharashtra)\n" + "d.Perambur (Tamilnadu)\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(80000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(80000);
								return true;
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a.Pune (Maharashtra)\n" + "c.Pimpri (Maharashtra)\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(80000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Pune (Maharashtra)\n" + "b.Rajkot (Gujarat)\n"
												+ "c.Pimpri (Maharashtra)\n" + "d.Perambur (Tamilnadu)\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(80000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a.Pune (Maharashtra)\n" + "c.Pimpri (Maharashtra)\n");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							candidate.setAmount(80000);
						} else {
							return false;
						}

					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(80000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										candidate.setAmount(80000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Pune (Maharashtra)\n" + "b.Rajkot (Gujarat)\n"
												+ "c.Pimpri (Maharashtra)\n" + "d.Perambur (Tamilnadu)\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(80000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(80000);
								return true;
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n"
												+ "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(80000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Pune (Maharashtra)\n" + "b.Rajkot (Gujarat)\n"
												+ "c.Pimpri (Maharashtra)\n" + "d.Perambur (Tamilnadu)\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(80000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						candidate.setAmount(80000);
						return true;
					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n" + "b. 50-50  \n"
								+ "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(80000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a.Pune (Maharashtra)\n" + "c.Pimpri (Maharashtra)\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(80000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Pune (Maharashtra)\n" + "b.Rajkot (Gujarat)\n"
												+ "c.Pimpri (Maharashtra)\n" + "d.Perambur (Tamilnadu)\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(80000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a.Pune (Maharashtra)\n" + "c.Pimpri (Maharashtra)\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(80000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n"
												+ "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(80000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a.Pune (Maharashtra)\n" + "b.Rajkot (Gujarat)\n"
												+ "c.Pimpri (Maharashtra)\n" + "d.Perambur (Tamilnadu)\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(80000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}
			} else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a.Pune (Maharashtra)\n" + "b.Rajkot (Gujarat)\n" + "c.Pimpri (Maharashtra)\n"
						+ "d.Perambur (Tamilnadu)\n");
				result = sc.next();
				if (result.equalsIgnoreCase("a")) {
					candidate.setAmount(80000);

					return true;
				}
			}

		}
		return false;
	}

	public static boolean fetchQuestion10(String name) throws Exception {
		System.out.println("10. Pollination is best defined as?");
		System.out.println("a)transfer of pollen from anther to stigma\n" + "b).germination of pollen grains\n"
				+ "c).growth of pollen tube in ovule\n" + "d).visiting flowers by insects\n" + "e) life line");
		result = sc.next();
		if (result.equalsIgnoreCase("a")) {
			candidate.setAmount(100000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out
								.println("option a = 92%\n" + "option b = 5%\n" + "option c = 3%\n" + "option d = 0%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							candidate.setAmount(100000);
							return true;
						} else {
							return false;
						}
					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)transfer of pollen from anther to stigma\n"
										+ "c).growth of pollen tube in ovule\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(100000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										candidate.setAmount(100000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)transfer of pollen from anther to stigma\r\n"
												+ "b).germination of pollen grains\n"
												+ "c).growth of pollen tube in ovule\n"
												+ "d).visiting flowers by insects\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(100000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(100000);
								return true;
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)transfer of pollen from anther to stigma\n"
												+ "c).growth of pollen tube in ovule\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(100000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)transfer of pollen from anther to stigma\r\n"
												+ "b).germination of pollen grains\n"
												+ "c).growth of pollen tube in ovule\n"
												+ "d).visiting flowers by insects\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(100000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				} else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println(
								"a)transfer of pollen from anther to stigma\n" + "c).growth of pollen tube in ovule\n");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							candidate.setAmount(100000);
						} else {
							return false;
						}

					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 92%\n" + "option b = 5%\n" + "option c = 3%\n" + "option d = 0%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(100000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("c")) {
									if (skip_cnt != 0) {
										candidate.setAmount(100000);
										return true;
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)transfer of pollen from anther to stigma\r\n"
												+ "b).germination of pollen grains\n"
												+ "c).growth of pollen tube in ovule\n"
												+ "d).visiting flowers by insects\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(100000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(100000);
								return true;
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 92%\n" + "option b = 5%\n" + "option c = 3%\n"
												+ "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(100000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)transfer of pollen from anther to stigma\r\n"
												+ "b).germination of pollen grains\n"
												+ "c).growth of pollen tube in ovule\n"
												+ "d).visiting flowers by insects\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(100000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						candidate.setAmount(100000);
						return true;
					} else {
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n" + "b. 50-50  \n"
								+ "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println(
										"option a = 92%\n" + "option b = 5%\n" + "option c = 3%\n" + "option d = 0%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(100000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a)transfer of pollen from anther to stigma\n"
												+ "c).growth of pollen tube in ovule\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(100000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)transfer of pollen from anther to stigma\r\n"
												+ "b).germination of pollen grains\n"
												+ "c).growth of pollen tube in ovule\n"
												+ "d).visiting flowers by insects\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(100000);
											return true;
										} else
											return false;
									}
								}
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a)transfer of pollen from anther to stigma\n"
										+ "c).growth of pollen tube in ovule\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(100000);
									return true;
								} else {
									return false;
								}
							} else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 92%\n" + "option b = 5%\n" + "option c = 3%\n"
												+ "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(100000);
											return true;
										} else {
											return false;
										}
									} else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a)transfer of pollen from anther to stigma\r\n"
												+ "b).germination of pollen grains\n"
												+ "c).growth of pollen tube in ovule\n"
												+ "d).visiting flowers by insects\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(100000);
											return true;
										} else
											return false;
									}
								}
							}
						}
					}
				}
			} else {
				System.out.println("You have no life line left. Please select an option:");
				System.out
						.println("a)transfer of pollen from anther to stigma\r\n" + "b).germination of pollen grains\n"
								+ "c).growth of pollen tube in ovule\n" + "d).visiting flowers by insects\n");
				result = sc.next();
				if (result.equalsIgnoreCase("a")) {
					candidate.setAmount(100000);
					return true;
				}
			}

		}

		return false;
	}

}
